<?php

namespace App\Filament\Resources\Posts\Schemas;

use Filament\Schemas\Schema;
use Filament\Forms\Components\TextInput;
use Filament\Forms\Components\Select;
use Filament\Forms\Components\ColorPicker;
use Filament\Forms\Components\MarkdownEditor;
use Filament\Forms\Components\FileUpload;
use Filament\Forms\Components\TagsInput;
use Filament\Forms\Components\Checkbox;
use Filament\Forms\Components\DateTimePicker;
use Filament\Schemas\Components\Section;
use Filament\Schemas\Components\Group;

class PostForm
{
    public static function configure(Schema $schema): Schema
    {
        return $schema
            ->components([
                //
                Section::make('Post Details')
                    ->description('Fill in the details of the post')
                    ->icon('heroicon-o-document-text')
                    ->schema([
                        Group::make([
                            TextInput::make('title')
                                ->rules('required|min:5|max:50'),
                            TextInput::make('slug')
                                ->rules('required|min:3|max:50')
                                ->unique()
                                ->validationMessages([
                                    'unique' => 'Slug must be unique.',
                                ]),
                            Select::make('category_id')
                                ->label('Category')
                                ->relationship('category','name')
                                ->options(
                                    \App\Models\Category::all()->pluck('name', 'id')
                                )
                                ->rule('required')
                                ->validationMessages([
                                    'required' => 'You need to pick the Category.',
                                ])
                                // ->preload()
                                ->searchable(),
                            ColorPicker::make('color'),
                        ])->columns(2),
                        MarkdownEditor::make('body'),
                    ])->columnSpan(2),
                Group::make([
                    Section::make('Image Upload')->icon('heroicon-o-photo')->schema([
                        FileUpload::make("image")
                            ->required()
                            ->disk("public")
                            ->directory("post"),
                    ]),
                    Section::make('Meta Information')->icon('heroicon-o-bookmark')->schema([
                        // TagsInput::make('tags'),
                        Select::make('tags')
                            ->relationship('tags','name')
                            ->multiple()
                            ->preload(),
                        Checkbox::make('published'),
                    ]),
                    DateTimePicker::make('published_at'),
                ])->columnSpan(1)
            ])->columns(3);
    }
}
